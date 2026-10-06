package com.github.service.dotcom.models.response.copilot;

import g81.e;
import gz.a;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.r;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class EventsResponse {
    public static final Companion Companion = new Companion();
    public static final h[] c = {w.s(i.r, new a(17)), null};
    public final List a;
    public final Integer b;

    public static final class Companion {
        public final KSerializer serializer() {
            return EventsResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EventsResponse(int i, List list, Integer num) {
        this.a = (i & 1) == 0 ? r.r : list;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventsResponse)) {
            return false;
        }
        EventsResponse eventsResponse = (EventsResponse) obj;
        return k.b(this.a, eventsResponse.a) && k.b(this.b, eventsResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "EventsResponse(events=" + this.a + ", total=" + this.b + ")";
    }
}
