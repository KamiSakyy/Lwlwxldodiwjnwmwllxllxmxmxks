package com.github.rudroid.settings;

import com.github.rudroid.settings.TimezoneUpdateWorker;

@c71.e(c = "com.github.rudroid.settings.TimezoneUpdateWorker", f = "TimezoneUpdateWorker.kt", l = {96, 99}, m = "updateTimezone", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class m3 extends c71.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ TimezoneUpdateWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(TimezoneUpdateWorker timezoneUpdateWorker, c71.c cVar) {
        super(cVar);
        this.v = timezoneUpdateWorker;
    }

    public final Object v(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        TimezoneUpdateWorker.a aVar = TimezoneUpdateWorker.Companion;
        return this.v.e(null, null, this);
    }
}
