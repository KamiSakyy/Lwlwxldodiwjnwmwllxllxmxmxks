package com.github.rudroid.searchandfilter.complexfilter.project;

import com.github.service.models.response.LegacyProjectWithNumber;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.t.g(((LegacyProjectWithNumber) obj).r.r, ((LegacyProjectWithNumber) obj2).r.r);
    }
}
