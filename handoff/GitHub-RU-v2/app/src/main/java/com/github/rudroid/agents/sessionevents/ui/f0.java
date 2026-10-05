package com.github.rudroid.agents.sessionevents.ui;

import cd.s;
import com.github.service.models.response.type.PatchStatus;

/* loaded from: /home/user/work/p/classes.dex */
public final class f0 implements s.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j71.c f7926r;

    public f0(j71.c cVar) {
        this.f7926r = cVar;
    }

    @Override // cd.s.a
    public final void D2(String str, String str2, String str3, String str4) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "path");
        k71.k.g(str4, "branchName");
    }

    @Override // cd.s.a
    public final void S(String str) {
        k71.k.g(str, "path");
        this.f7926r.k(str);
    }

    @Override // cd.s.a
    public final void S2(String str, String str2, String str3, String str4) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "path");
        k71.k.g(str4, "branchName");
    }

    @Override // cd.s.a
    public final void f1(String str, String str2, String str3) {
        k71.k.g(str3, "filePath");
    }

    @Override // cd.s.a
    public final void x0(String str, String str2, PatchStatus patchStatus) {
        k71.k.g(str, "path");
        k71.k.g(patchStatus, "patchStatus");
    }

    @Override // cd.s.a
    public final void z0(String str, String str2) {
        k71.k.g(str, "path");
        k71.k.g(str2, "branchName");
    }
}
