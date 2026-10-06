package com.github.service.models.response;

import a0.s0;
import g81.e;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullRequestWidgetData {
    public static final Companion Companion = new Companion();
    public static final h[] d;
    public PullsWidgetFilter a;
    public int b;
    public List c;

    public static final class Companion {
        public final KSerializer serializer() {
            return PullRequestWidgetData$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        d = new h[]{w.s(iVar, new wm.a(22)), null, w.s(iVar, new wm.a(23))};
    }

    public /* synthetic */ PullRequestWidgetData(int i, PullsWidgetFilter pullsWidgetFilter, int i2, List list) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, PullRequestWidgetData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = pullsWidgetFilter;
        this.b = i2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullRequestWidgetData)) {
            return false;
        }
        PullRequestWidgetData pullRequestWidgetData = (PullRequestWidgetData) obj;
        return this.a == pullRequestWidgetData.a && this.b == pullRequestWidgetData.b && k.b(this.c, pullRequestWidgetData.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PullRequestWidgetData(filterMode=");
        sb.append(this.a);
        sb.append(", pullsCount=");
        sb.append(this.b);
        sb.append(", pullsList=");
        return x.i.l(sb, this.c, ")");
    }

    public PullRequestWidgetData(PullsWidgetFilter pullsWidgetFilter, int i, List list) {
        this.a = pullsWidgetFilter;
        this.b = i;
        this.c = list;
    }
}
