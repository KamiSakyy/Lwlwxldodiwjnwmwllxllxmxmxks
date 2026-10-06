package com.github.rudroid.auth;

import com.github.service.models.ApiFailure;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i f8553a;

    /* renamed from: b, reason: collision with root package name */
    public final ApiFailure f8554b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f8555c;

    public k(i iVar, ApiFailure apiFailure, Throwable th, int i) {
        apiFailure = (i & 2) != 0 ? null : apiFailure;
        th = (i & 4) != 0 ? null : th;
        this.f8553a = iVar;
        this.f8554b = apiFailure;
        this.f8555c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8553a == kVar.f8553a && k71.k.b(this.f8554b, kVar.f8554b) && k71.k.b(this.f8555c, kVar.f8555c);
    }

    public final int hashCode() {
        int hashCode = this.f8553a.hashCode() * 31;
        ApiFailure apiFailure = this.f8554b;
        int hashCode2 = (hashCode + (apiFailure == null ? 0 : apiFailure.hashCode())) * 31;
        Throwable th = this.f8555c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "LoginFailure(error=" + this.f8553a + ", apiFailure=" + this.f8554b + ", exception=" + this.f8555c + ")";
    }
}
