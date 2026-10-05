package com.github.service.wrapper;

import a0.s0;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import k71.k;
import x61.m;

/* loaded from: /home/user/work/p/classes4.dex */
final class PartialApiDataMissException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PartialApiDataMissException(String str, ApiFailure apiFailure) {
        super(r9.toString());
        k.g(str, "request");
        k.g(apiFailure, "apiFailure");
        String c0 = m.c0(apiFailure.v, ".", null, null, 0, null, 62);
        ApiFailureType apiFailureType = apiFailure.r;
        StringBuilder o = s0.o("Partial data miss for ", str, " in  ", c0, " : ");
        o.append(apiFailureType);
    }
}
