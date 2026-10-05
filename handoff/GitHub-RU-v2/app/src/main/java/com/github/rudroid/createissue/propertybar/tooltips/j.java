package com.github.rudroid.createissue.propertybar.tooltips;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f10509a;

    public j(ZonedDateTime zonedDateTime) {
        this.f10509a = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.f10509a, ((j) obj).f10509a);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.f10509a;
        if (zonedDateTime == null) {
            return 0;
        }
        return zonedDateTime.hashCode();
    }

    public final String toString() {
        return "CopilotHomeTooltipsPref(copilotHomeAgentSessionsMovedTooltipShown=" + this.f10509a + ")";
    }
}
