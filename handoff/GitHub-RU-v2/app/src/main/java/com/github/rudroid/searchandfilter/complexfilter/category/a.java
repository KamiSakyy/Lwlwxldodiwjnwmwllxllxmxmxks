package com.github.rudroid.searchandfilter.complexfilter.category;

import com.github.domain.discussions.data.DiscussionCategoryData;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public DiscussionCategoryData a;
    public boolean b;

    public a(DiscussionCategoryData discussionCategoryData, boolean z) {
        k71.k.g(discussionCategoryData, "category");
        this.a = discussionCategoryData;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableDiscussionCategory(category=" + this.a + ", isSelected=" + this.b + ")";
    }
}
