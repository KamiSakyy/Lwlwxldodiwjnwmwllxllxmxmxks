package com.github.rudroid.starredreposandlists.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import mg.c;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class StarredReposAndListsRoute implements c {
    public static final Companion Companion = new Companion();
    public String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return StarredReposAndListsRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarredReposAndListsRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            c1Shadow.l(i, 1, StarredReposAndListsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StarredReposAndListsRoute) && k.b(this.a, ((StarredReposAndListsRoute) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("StarredReposAndListsRoute(login=", this.a, ")");
    }
}
