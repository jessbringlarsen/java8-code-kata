package date.and.time.api;

import common.test.tool.dataset.DateAndTimes;
import org.junit.Assert;
import org.junit.Test;

import java.time.*;

import static org.hamcrest.CoreMatchers.is;

public class ClockExploration {

    @Test
    public void testClock() {
        ZoneId timeZone = ZoneId.of("Europe/Copenhagen");
        Instant instant = ZonedDateTime.of(DateAndTimes.LDT_20150618_23073050, timeZone).toInstant();
        Clock fixedClock = Clock.fixed(instant, timeZone);

        Assert.assertThat(fixedClock.instant(), is(instant));
    }
}
