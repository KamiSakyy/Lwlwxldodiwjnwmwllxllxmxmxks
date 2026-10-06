package com.github.service.models.response;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class PullsWidgetPullRow {
    public static final Companion Companion = new Companion();
    public static final h[] g = {null, null, null, null, null, w.s(i.r, new wm.a(24))};
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public CheckStatusState f;

    public static final class Companion {
        public final KSerializer serializer() {
            return PullsWidgetPullRow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PullsWidgetPullRow(int i, String str, int i2, String str2, String str3, String str4, CheckStatusState checkStatusState) {
        if (63 != (i & 63)) {
            c1Shadow.l(i, 63, PullsWidgetPullRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = checkStatusState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullsWidgetPullRow)) {
            return false;
        }
        PullsWidgetPullRow pullsWidgetPullRow = (PullsWidgetPullRow) obj;
        return k.b(this.a, pullsWidgetPullRow.a) && this.b == pullsWidgetPullRow.b && k.b(this.c, pullsWidgetPullRow.c) && k.b(this.d, pullsWidgetPullRow.d) && k.b(this.e, pullsWidgetPullRow.e) && this.f == pullsWidgetPullRow.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + h1.i(h1.i(h1.i(s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "PullsWidgetPullRow(title=", this.a, ", number=", ", url=");
        f1.e.x(n, this.c, ", repoOwner=", this.d, ", repoName=");
        n.append(this.e);
        n.append(", state=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }

    public PullsWidgetPullRow(String str, int i, String str2, String str3, String str4, CheckStatusState checkStatusState) {
        k.g(checkStatusState, "state");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = checkStatusState;
    }
}
