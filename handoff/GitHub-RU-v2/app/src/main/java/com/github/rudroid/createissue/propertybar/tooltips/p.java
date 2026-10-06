package com.github.rudroid.createissue.propertybar.tooltips;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public ZonedDateTime f10517a;

    /* renamed from: b, reason: collision with root package name */
    public ZonedDateTime f10518b;

    public p(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        this.f10517a = zonedDateTime;
        this.f10518b = zonedDateTime2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.f10517a, pVar.f10517a) && k71.k.b(this.f10518b, pVar.f10518b);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.f10517a;
        int hashCode = (zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31;
        ZonedDateTime zonedDateTime2 = this.f10518b;
        return hashCode + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0);
    }

    public final String toString() {
        return "CreateNewIssueTooltipsPref(codingAgentAssignmentTooltipShownOn=" + this.f10517a + ", codingAgentCustomInstructionsTooltipShownOn=" + this.f10518b + ")";
    }
}
