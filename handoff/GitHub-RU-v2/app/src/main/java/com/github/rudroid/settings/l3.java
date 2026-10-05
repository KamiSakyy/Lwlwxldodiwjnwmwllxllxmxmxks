package com.github.rudroid.settings;

import java.util.Iterator;

@c71.e(c = "com.github.rudroid.settings.TimezoneUpdateWorker", f = "TimezoneUpdateWorker.kt", l = {81}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l3 extends c71.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ TimezoneUpdateWorker B;
    public int C;
    public String u;
    public Iterable v;
    public Iterator w;
    public boolean x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(TimezoneUpdateWorker timezoneUpdateWorker, c71.c cVar) {
        super(cVar);
        this.B = timezoneUpdateWorker;
    }

    public final Object v(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(this);
    }
}
