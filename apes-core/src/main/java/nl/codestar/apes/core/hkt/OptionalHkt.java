package nl.codestar.apes.core.hkt;

import nl.codestar.apes.core.canbuild.Builder;
import nl.codestar.apes.core.canbuild.CanBuild;
import nl.codestar.apes.core.function.Function1;
import nl.codestar.apes.core.tuple.Cons;
import nl.codestar.apes.core.typeclass.Functor;

import java.util.Optional;

public class OptionalHkt<A> implements Hkt<OptionalHkt.Mu, A> {
    public static class Mu {}

    public static Functor<Mu> FUNCTOR = new Functor<Mu>() {
        @Override
        public <A, B> Hkt<Mu, B> map(Hkt<Mu, A> optionalHkt, Function1<A, B> fn) {
            return of(coerce(optionalHkt).map(fn::apply));
        }
    };

    public static CanBuild<Mu> CAN_BUILD = new CanBuild<Mu>() {
        @Override
        public <A, B> Hkt<Mu, Cons<A, B>> combine(Hkt<Mu, A> leftHkt, Hkt<Mu, B> rightHkt) {
            Optional<A> left = coerce(leftHkt);
            Optional<B> right = coerce(rightHkt);
            if (left.isPresent() && right.isPresent()) {
                return of(new Cons<>(left.get(), right.get()));
            } else {
                return empty();
            }
        }
    };

    public static Builder<Mu> BUILDER = new Builder<>(CAN_BUILD);

    private final Optional<A> instance;

    public OptionalHkt(Optional<A> instance) {
        this.instance = instance;
    }

    public static <A> OptionalHkt<A> of(Optional<A> value) {
        return new OptionalHkt<>(value);
    }

    public static <A> OptionalHkt<A> of(A value) {
        return of(Optional.of(value));
    }

    public static <A> OptionalHkt<A> ofNullable(A value) {
        return of(Optional.ofNullable(value));
    }

    public static <A> OptionalHkt<A> empty() {
        return of(Optional.empty());
    }

    public static <A> Optional<A> coerce(Hkt<OptionalHkt.Mu, A> hkt) {
        OptionalHkt<A> coerced = hkt.coerce();
        return coerced.instance;
    }
}
