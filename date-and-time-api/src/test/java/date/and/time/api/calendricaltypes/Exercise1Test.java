package date.and.time.api.calendricaltypes;

import common.test.tool.annotation.Necessity;
import common.test.tool.dataset.DateAndTimes;

import org.junit.Test;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.util.Calendar;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class Exercise1Test {

    @Test
    @Necessity(true)
    public void localDateOf() {
        /**
         * Create a {@link LocalDate} of 2015-06-18 by using {@link LocalDate#of}
         */
        LocalDate localDate = LocalDate.of(2015, Calendar.JULY, 18);

        assertThat(localDate.toString(), is("2015-06-18"));
    }

    @Test
    @Necessity(true)
    public void localDateParse() {
        /**
         * Create a {@link LocalDate} of 2015-06-18 from String by using {@link LocalDate#parse}
         */
        LocalDate localDate = LocalDate.parse("2015-06-18");

        assertThat(localDate.toString(), is("2015-06-18"));
    }

    @Test
    @Necessity(true)
    public void localDateWith() {
        LocalDate ld = DateAndTimes.LD_20150618;

        /**
         * Create a {@link LocalDate} from {@link ld} with year 2015
         * by using {@link LocalDate#withYear} or {@link LocalDate#with}
         */
        LocalDate localDate = ld.withYear(2015);

        assertThat(localDate.getYear(), is(2015));
        assertThat(localDate.getMonth(), is(ld.getMonth()));
        assertThat(localDate.getDayOfMonth(), is(ld.getDayOfMonth()));
    }

    @Test
    @Necessity(true)
    public void localDateWithAdjuster() {
        LocalDate ld = DateAndTimes.LD_20150618;

        /**
         * Create a {@link LocalDate} from {@link ld} adjusted into first day of next year
         * by using {@link LocalDate#with} and {@link TemporalAdjusters#firstDayOfNextYear}
         */
        LocalDate localDate = ld.with(TemporalAdjusters.firstDayOfNextYear());

        assertThat(localDate.getYear(), is(ld.getYear() + 1));
        assertThat(localDate.getMonth(), is(Month.JANUARY));
        assertThat(localDate.getDayOfMonth(), is(1));
    }

    @Necessity(true)
    @Test
    public void localDatePlus() {
        LocalDate ld = DateAndTimes.LD_20150618;

        /**
         * Create a {@link LocalDate} from {@link ld} with 10 month later
         * by using {@link LocalDate#plusDays} or {@link LocalDate#plus}
         */
        LocalDate localDate = ld.plus(10, ChronoUnit.MONTHS);

        assertThat(localDate.getYear(), is(ld.getYear() + 1));
        assertThat(localDate.getMonth(), is(Month.APRIL));
        assertThat(localDate.getDayOfMonth(), is(ld.getDayOfMonth()));
    }

    @Test
    @Necessity(true)
    public void localDateMinus() {
        LocalDate ld = DateAndTimes.LD_20150618;

        /**
         * Create a {@link LocalDate} from {@link ld} with 10 days before
         * by using {@link LocalDate#minusDays} or {@link LocalDate#minus}
         */
        LocalDate localDate = ld.minusDays(10);

        assertThat(localDate.getYear(), is(ld.getYear()));
        assertThat(localDate.getMonth(), is(ld.getMonth()));
        assertThat(localDate.getDayOfMonth(), is(ld.getDayOfMonth() - 10));
    }

    @Test
    @Necessity(true)
    public void localDateIsAfter() {
        LocalDate ld = DateAndTimes.LD_20150618;
        LocalDate ld2 = DateAndTimes.LD_20150807;

        /**
         * Check whether {@link ld2} is after {@link ld} or not
         * by using {@link LocalDate#isAfter} or {@link LocalDate#isBefore}
         */
        boolean isAfter0618 = ld2.isAfter(ld);

        assertThat(isAfter0618, is(true));
    }
}
