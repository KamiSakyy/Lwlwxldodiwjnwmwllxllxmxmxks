package wd;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public gi.c f33510a;

    public m(gi.c cVar) {
        k71.k.g(cVar, "systemPreferences");
        this.f33510a = cVar;
    }

    public final Object a(c71.j jVar) {
        Object d10 = this.f33510a.d(jVar, new Long(ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli()), gi.d.k);
        return d10 == b71.a.r ? d10 : a0.a;
    }
}
