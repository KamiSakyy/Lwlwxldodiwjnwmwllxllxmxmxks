package com.github.rudroid.shortcuts.activities;

import com.github.rudroid.fragments.GitHubFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ GitHubFragment s;

    public /* synthetic */ r(GitHubFragment gitHubFragment, int i) {
        this.r = i;
        this.s = gitHubFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.y m;
        d.y m2;
        d.y m3;
        switch (this.r) {
            case 0:
                k.i w3 = ((ConfigureShortcutFragment) this.s).w3();
                if (w3 != null && (m = w3.m()) != null) {
                    m.c();
                    break;
                }
                break;
            case 1:
                k.i w32 = this.s.w3();
                if (w32 != null && (m2 = w32.m()) != null) {
                    m2.c();
                    break;
                }
                break;
            default:
                k.i w33 = this.s.w3();
                if (w33 != null && (m3 = w33.m()) != null) {
                    m3.c();
                    break;
                }
                break;
        }
    }
}
