package com.github.rudroid.discussions.navigation;

import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class DiscussionCategoryChooserRoute {
    public static final Companion Companion = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public String f11560a;

    /* renamed from: b, reason: collision with root package name */
    public String f11561b;

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionCategoryChooserRoute$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DiscussionCategoryChooserRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, DiscussionCategoryChooserRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f11560a = str;
        this.f11561b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscussionCategoryChooserRoute)) {
            return false;
        }
        DiscussionCategoryChooserRoute discussionCategoryChooserRoute = (DiscussionCategoryChooserRoute) obj;
        return k.b(this.f11560a, discussionCategoryChooserRoute.f11560a) && k.b(this.f11561b, discussionCategoryChooserRoute.f11561b);
    }

    public final int hashCode() {
        return this.f11561b.hashCode() + (this.f11560a.hashCode() * 31);
    }

    public final String toString() {
        return i.g("DiscussionCategoryChooserRoute(repositoryOwner=", this.f11560a, ", repositoryName=", this.f11561b, ")");
    }

    public DiscussionCategoryChooserRoute(String str, String str2) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        this.f11560a = str;
        this.f11561b = str2;
    }
}
