package com.github.rudroid.searchandfilter.complexfilter.organization;

import com.github.service.models.response.organizations.Organization;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.t.g(((Organization) obj).t, ((Organization) obj2).t);
    }
}
