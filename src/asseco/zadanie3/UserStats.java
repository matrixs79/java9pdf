package asseco.zadanie3;

import java.util.Optional;

public class UserStats implements VisitCounterRepository {

    Optional<Long>  visitCount;

    @Override
    public Optional<VisitCounter> visitCouterRepo() {


        return Optional.empty();
    }
}
