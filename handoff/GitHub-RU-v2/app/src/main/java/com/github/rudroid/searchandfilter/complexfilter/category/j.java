package com.github.rudroid.searchandfilter.complexfilter.category;

import com.github.domain.discussions.data.DiscussionCategoryData;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.t.g(((DiscussionCategoryData) obj).s, ((DiscussionCategoryData) obj2).s);
    }
}
