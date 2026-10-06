package com.github.rudroid.interfaces;

import com.github.rudroid.webview.viewholders.GitHubWebView;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements GitHubWebView.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f15140a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f15141b;

    public d(String str, u0 u0Var) {
        k71.k.g(str, "id");
        k71.k.g(u0Var, "taskListCheckboxCheckedCallback");
        this.f15140a = str;
        this.f15141b = u0Var;
    }

    public final GitHubWebView.f a() {
        return this.f15141b.I0(this.f15140a);
    }

    public final void b(int i, boolean z10) {
        this.f15141b.G1(i, this.f15140a, z10);
    }

    public final boolean isEnabled() {
        return this.f15141b.y(this.f15140a);
    }
}
