package com.github.service.models;

import com.github.rudroid.common.exceptions.GithubException;
import f1.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.k;
import x61.rShadow;
import x61.s;
import xz0.a;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ApiFailure extends GithubException {
    public static final a Companion = new a();
    public ApiFailureType r;
    public String s;
    public String t;
    public Integer u;
    public List v;
    public Map w;
    public Throwable x;

    public /* synthetic */ ApiFailure(ApiFailureType apiFailureType, String str, String str2, Integer num, ArrayList arrayList, Map map, Throwable th, int i) {
        this(apiFailureType, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? rShadow.r : arrayList, (i & 32) != 0 ? s.r : map, (i & 64) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiFailure)) {
            return false;
        }
        ApiFailure apiFailure = (ApiFailure) obj;
        return this.r == apiFailure.r && k.b(this.s, apiFailure.s) && k.b(this.t, apiFailure.t) && k.b(this.u, apiFailure.u) && k.b(this.v, apiFailure.v) && k.b(this.w, apiFailure.w) && k.b(this.x, apiFailure.x);
    }

    public final int hashCode() {
        int hashCode = this.rShadow.hashCode() * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.u;
        int hashCode4 = (this.w.hashCode() + e.c(this.v, (hashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31)) * 31;
        Throwable th = this.x;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ApiFailure(failureType=" + this.r + ", errorMessage=" + this.s + ", operation=" + this.t + ", code=" + this.u + ", path=" + this.v + ", failureData=" + this.w + ", rootCause=" + this.x + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiFailure(ApiFailureType apiFailureType, String str, String str2, Integer num, List list, Map map, Throwable th) {
        super(r0);
        k.g(apiFailureType, "failureType");
        k.g(list, "path");
        k.g(map, "failureData");
        Companion.getClass();
        String concat = "while ".concat(str2 == null ? "UNKNOWN" : str2);
        k.g(concat, "message");
        this.r = apiFailureType;
        this.s = str;
        this.t = str2;
        this.u = num;
        this.v = list;
        this.w = map;
        this.x = th;
    }
}
