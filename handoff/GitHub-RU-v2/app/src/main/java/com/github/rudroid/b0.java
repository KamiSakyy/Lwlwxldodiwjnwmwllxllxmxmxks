package com.github.rudroid;

import android.content.SharedPreferences;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b0 implements z4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8656b;

    public /* synthetic */ b0(int i, Object obj) {
        this.f8655a = i;
        this.f8656b = obj;
    }

    @Override // z4.a
    public final void accept(Object obj) {
        int i = this.f8655a;
        Object obj2 = this.f8656b;
        switch (i) {
            case k5.f.J:
                GitHubApplication gitHubApplication = (GitHubApplication) obj2;
                c0 c0Var = GitHubApplication.Companion;
                k71.k.g((Throwable) obj, "it");
                gitHubApplication.deleteDatabase(w8.q.class.getSimpleName());
                SharedPreferences sharedPreferences = gitHubApplication.getSharedPreferences(w8.q.class.getSimpleName(), 0);
                k71.k.f(sharedPreferences, "getSharedPreferences(...)");
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.clear();
                edit.apply();
                w8.q.a0(gitHubApplication, gitHubApplication.e(true));
                break;
            default:
                ((x71.t) obj2).j((p8.h) obj);
                break;
        }
    }
}
