package com.github.rudroid.starredreposandlists.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class EditListRoute {
    public static final Companion Companion = new Companion();
    public String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return EditListRoute$$serializer.INSTANCE;
        }
    }

    public EditListRoute(String str) {
        k.g(str, "slug");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditListRoute) && k.b(this.a, ((EditListRoute) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("EditListRoute(slug=", this.a, ")");
    }

    public /* synthetic */ EditListRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            c1Shadow.l(i, 1, EditListRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
