package com.github.rudroid.commits.navigation;

import com.github.rudroid.commits.CommitsType;
import g81.e;
import k71.k;
import k81.c1;
import kh.a;
import kotlinx.serialization.KSerializer;
import ob.c;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class CommitsRoute implements c {
    public static final Companion Companion = new Companion();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f9213s = {w.s(i.r, new a(23))};

    /* renamed from: r, reason: collision with root package name */
    public CommitsType f9214r;

    public static final class Companion {
        public final KSerializer serializer() {
            return CommitsRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CommitsRoute(int i, CommitsType commitsType) {
        if (1 == (i & 1)) {
            this.f9214r = commitsType;
        } else {
            c1.l(i, 1, CommitsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommitsRoute) && k.b(this.f9214r, ((CommitsRoute) obj).f9214r);
    }

    public final int hashCode() {
        return this.f9214r.hashCode();
    }

    public final String toString() {
        return "CommitsRoute(type=" + this.f9214r + ")";
    }

    public CommitsRoute(CommitsType commitsType) {
        this.f9214r = commitsType;
    }
}
