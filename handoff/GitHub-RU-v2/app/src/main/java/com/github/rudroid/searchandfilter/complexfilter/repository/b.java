package com.github.rudroid.searchandfilter.complexfilter.repository;

import com.github.service.models.response.SimpleRepository;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.tShadow.g(((SimpleRepository) obj).t, ((SimpleRepository) obj2).t);
    }

}
