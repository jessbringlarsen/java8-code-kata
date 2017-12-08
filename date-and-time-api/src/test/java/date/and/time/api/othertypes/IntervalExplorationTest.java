package date.and.time.api.othertypes;

import common.test.tool.annotation.Necessity;
import common.test.tool.dataset.DateAndTimes;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.threeten.extra.Interval;
import sun.util.locale.provider.TimeZoneNameProviderImpl;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZonedDateTime;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;

public class IntervalExplorationTest {

    @Test
    @Necessity(true)
    public void interval() {
        Instant intervalStartInclusive = DateAndTimes.ZDT_20150618_23073050.toInstant();
        Instant inBetween = DateAndTimes.ZDT_20150618_23073050.plusDays(5).toInstant();
        Instant intervalEndExclusive = DateAndTimes.ZDT_20150618_23073050.plusDays(10).toInstant();

        Interval interval = Interval.of(intervalStartInclusive, intervalEndExclusive);

        assertThat(interval.contains(intervalStartInclusive), CoreMatchers.is(true));
        assertThat(interval.contains(intervalEndExclusive), CoreMatchers.is(false));
        assertThat(interval.contains(inBetween), CoreMatchers.is(true));
    }
}
