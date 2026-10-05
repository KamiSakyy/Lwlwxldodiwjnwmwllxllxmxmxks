package com.github.rudroid.settings.applock;

import kotlin.NoWhenBranchMatchedException;
import sb.a;

/* loaded from: /home/user/work/p/classes3.dex */
final class g<T> implements y71.j {
    public final /* synthetic */ k r;

    public static final /* synthetic */ class a {
        static {
            int[] iArr = new int[a.a.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a.a aVar = a.a.r;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(k kVar) {
        this.r = kVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        k kVar = this.r;
        v71.z zVar = kVar.e;
        int ordinal = ((a.a) obj).ordinal();
        if (ordinal == 0) {
            v71.b0.z(zVar, (a71.h) null, (v71.a0) null, new j(kVar, null), 3);
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            v71.b0.z(zVar, (a71.h) null, (v71.a0) null, new e(kVar, null), 3);
        }
        return w61.a0.a;
    }



}
