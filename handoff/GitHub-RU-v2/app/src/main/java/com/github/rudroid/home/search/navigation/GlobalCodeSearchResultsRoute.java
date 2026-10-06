package com.github.rudroid.home.search.navigation;

import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class GlobalCodeSearchResultsRoute {
    public static final Companion Companion = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public String f15051a;

    public static final class Companion {
        public final KSerializer serializer() {
            return GlobalCodeSearchResultsRoute$$serializer.INSTANCE;
        }
    }

    public GlobalCodeSearchResultsRoute(String str) {
        k.g(str, "query");
        this.f15051a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GlobalCodeSearchResultsRoute) && k.b(this.f15051a, ((GlobalCodeSearchResultsRoute) obj).f15051a);
    }

    public final int hashCode() {
        return this.f15051a.hashCode();
    }

    public final String toString() {
        return f1.e.z("GlobalCodeSearchResultsRoute(query=", this.f15051a, ")");
    }

    public /* synthetic */ GlobalCodeSearchResultsRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.f15051a = str;
        } else {
            c1.l(i, 1, GlobalCodeSearchResultsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
