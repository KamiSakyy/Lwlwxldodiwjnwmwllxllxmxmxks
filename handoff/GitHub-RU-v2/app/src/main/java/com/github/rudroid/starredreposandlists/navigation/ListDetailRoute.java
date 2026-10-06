package com.github.rudroid.starredreposandlists.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ListDetailRoute {
    public static final Companion Companion = new Companion();
    public String a;
    public String b;

    public static final class Companion {
        public final KSerializer serializer() {
            return ListDetailRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ListDetailRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, ListDetailRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListDetailRoute)) {
            return false;
        }
        ListDetailRoute listDetailRoute = (ListDetailRoute) obj;
        return k.b(this.a, listDetailRoute.a) && k.b(this.b, listDetailRoute.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("ListDetailRoute(login=", this.a, ", slug=", this.b, ")");
    }

    public ListDetailRoute(String str, String str2) {
        k.g(str, "login");
        k.g(str2, "slug");
        this.a = str;
        this.b = str2;
    }
}
