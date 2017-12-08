package date.and.time.api.othertypes;

import common.test.tool.annotation.Necessity;
import common.test.tool.dataset.DateAndTimes;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PeriodExplorationTest {

    @Test
    @Necessity(true)
    public void localDatePlusPeriod() {
        LocalDate ld = DateAndTimes.LD_20150618;

        /**
         * Define a {@link Period} of 1 year 2 month 3 days
         * Create a {@link LocalDate} adding the period to {@link ld} by using {@link LocalDate#plus}
         */
        Period period = Period.of(1, 2, 3);
        LocalDate localDate = ld.plus(period);

        assertThat(localDate.getYear(), is(ld.getYear() + 1));
        assertThat(period.getMonths(), is(2));
        assertThat(localDate.getDayOfMonth(), is(ld.getDayOfMonth() + 3));
    }

    @Test
    @Necessity(true)
    public void localDateUntil() {
        LocalDate ld = DateAndTimes.LD_20150618;
        LocalDate ld2 = DateAndTimes.LD_20150807;

        /**
         * Create a period from {@link ld} till {@link ld2}
         * by using {@link LocalDate#until}
         */
        Period period = Period.between(ld, ld2);

        assertThat(period.getYears(), is(0));
        assertThat(period.getMonths(), is(1));
        assertThat(period.getDays(), is(20));
    }
}
