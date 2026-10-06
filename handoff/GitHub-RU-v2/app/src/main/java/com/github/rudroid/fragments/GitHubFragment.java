package com.github.rudroid.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.platform.ComposeView;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.activities.m0;
import com.github.rudroid.utilities.k2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class GitHubFragment extends Hilt_GitHubFragment {

    /* renamed from: y0, reason: collision with root package name */
    public qe.a f13672y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f13673z0;

    public static void x4(GitHubFragment gitHubFragment, com.github.rudroid.activities.h0 h0Var, m0.b bVar, ViewGroup viewGroup, int i) {
        String str;
        boolean z10 = h0Var.f5820b;
        int i10 = 0;
        if ((i & 2) != 0 && z10) {
            i10 = -1;
        }
        int i11 = i10;
        m0.b bVar2 = (i & 4) != 0 ? null : bVar;
        ViewGroup viewGroup2 = (i & 8) != 0 ? null : viewGroup;
        gitHubFragment.getClass();
        String str2 = h0Var.f5819a;
        if (str2.length() == 0) {
            Context y32 = gitHubFragment.y3();
            str = y32 != null ? y32.getString(2131952512) : null;
        } else {
            str = str2;
        }
        z4(gitHubFragment, str, i11, bVar2, viewGroup2, z10 ? k2.a.r : k2.a.s, null, 32);
    }

    public static boolean y4(GitHubFragment gitHubFragment, int i, m0.b bVar, ViewGroup viewGroup, ComposeView composeView, int i10) {
        int i11 = (i10 & 2) != 0 ? -1 : 0;
        m0.b bVar2 = (i10 & 4) != 0 ? null : bVar;
        ViewGroup viewGroup2 = (i10 & 8) != 0 ? null : viewGroup;
        k2.a aVar = k2.a.s;
        ComposeView composeView2 = (i10 & 32) != 0 ? null : composeView;
        gitHubFragment.getClass();
        Context y32 = gitHubFragment.y3();
        return gitHubFragment.w4(y32 != null ? y32.getString(i) : null, i11, bVar2, viewGroup2, aVar, composeView2);
    }

    public static /* synthetic */ boolean z4(GitHubFragment gitHubFragment, String str, int i, m0.b bVar, ViewGroup viewGroup, k2.a aVar, ComposeView composeView, int i10) {
        ComposeView composeView2;
        GitHubFragment gitHubFragment2;
        String str2;
        if ((i10 & 2) != 0) {
            i = -1;
        }
        int i11 = i;
        m0.b bVar2 = (i10 & 4) != 0 ? null : bVar;
        ViewGroup viewGroup2 = (i10 & 8) != 0 ? null : viewGroup;
        if ((i10 & 16) != 0) {
            aVar = k2.a.s;
        }
        k2.a aVar2 = aVar;
        if ((i10 & 32) != 0) {
            composeView2 = null;
            str2 = str;
            gitHubFragment2 = gitHubFragment;
        } else {
            composeView2 = composeView;
            gitHubFragment2 = gitHubFragment;
            str2 = str;
        }
        return gitHubFragment2.w4(str2, i11, bVar2, viewGroup2, aVar2, composeView2);
    }

    public final void A4(String str) {
        k71.k.g(str, "text");
        k.i w32 = w3();
        com.github.rudroid.activities.m0 m0Var = w32 instanceof com.github.rudroid.activities.m0 ? (com.github.rudroid.activities.m0) w32 : null;
        if (m0Var != null) {
            m0.a aVar = com.github.rudroid.activities.m0.Companion;
            m0Var.r0(str, 0);
        }
    }

    @Override // androidx.fragment.app.a0
    public void P3(Bundle bundle) {
        super.P3(bundle);
        this.f13673z0 = bundle != null;
    }

    @Override // androidx.fragment.app.a0
    public final Animation Q3(boolean z10) {
        Context y32 = y3();
        if (!z10 || !this.f13673z0 || y32 == null) {
            return null;
        }
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.v;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar)) {
            return AnimationUtils.loadAnimation(y32, 2130772016);
        }
        return null;
    }

    @Override // androidx.fragment.app.a0
    public void Y3() {
        this.Y = true;
        qe.a aVar = this.f13672y0;
        if (aVar != null) {
            aVar.e(g4().getClass().getSimpleName(), getClass().getSimpleName());
        } else {
            k71.k.m("crashLogger");
            throw null;
        }
    }

    public final com.github.rudroid.activities.h0 u4(fl.b bVar) {
        k.i w32 = w3();
        if (w32 instanceof com.github.rudroid.activities.m0) {
            return ((com.github.rudroid.activities.m0) w32).c0(bVar);
        }
        return null;
    }

    public final void v4(rh.f fVar) {
        k71.k.g(fVar, "uiErrorModel");
        k.i w32 = w3();
        com.github.rudroid.activities.m0 m0Var = w32 instanceof com.github.rudroid.activities.m0 ? (com.github.rudroid.activities.m0) w32 : null;
        if (m0Var != null) {
            m0Var.k0(fVar);
        }
    }

    public final boolean w4(String str, int i, m0.b bVar, ViewGroup viewGroup, k2.a aVar, View view) {
        k71.k.g(aVar, "snackBarType");
        if (str == null) {
            return false;
        }
        androidx.fragment.app.l1 F3 = F3();
        F3.b();
        if (F3.f2601v.f2847v != androidx.lifecycle.w.f2943v) {
            return false;
        }
        k.i w32 = w3();
        com.github.rudroid.activities.m0 m0Var = w32 instanceof com.github.rudroid.activities.m0 ? (com.github.rudroid.activities.m0) w32 : null;
        if (m0Var != null) {
            return com.github.rudroid.utilities.k2.a(m0Var, str, i, bVar, viewGroup, aVar, view);
        }
        return false;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ComposeView {
        public ComposeView() {
        }
    }

    public Object Y;
}
