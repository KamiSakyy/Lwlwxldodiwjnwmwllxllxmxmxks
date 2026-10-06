package com.github.rudroid.actions.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sa.c;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class CheckDetailRoute implements c {
    public static final Companion Companion = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public String f5108a;

    /* renamed from: b, reason: collision with root package name */
    public String f5109b;

    public static final class Companion {
        public final KSerializer serializer() {
            return CheckDetailRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CheckDetailRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, CheckDetailRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5108a = str;
        this.f5109b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckDetailRoute)) {
            return false;
        }
        CheckDetailRoute checkDetailRoute = (CheckDetailRoute) obj;
        return k.b(this.f5108a, checkDetailRoute.f5108a) && k.b(this.f5109b, checkDetailRoute.f5109b);
    }

    public final int hashCode() {
        int hashCode = this.f5108a.hashCode() * 31;
        String str = this.f5109b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("CheckDetailRoute(checkRunId=", this.f5108a, ", pullRequestId=", this.f5109b, ")");
    }

    public CheckDetailRoute(String str, String str2) {
        k.g(str, "checkRunId");
        this.f5108a = str;
        this.f5109b = str2;
    }
}
