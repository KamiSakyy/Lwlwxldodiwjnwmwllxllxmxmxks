package com.github.rudroid.templates;

import android.os.Bundle;
import androidx.lifecycle.l1;
import androidx.lifecycle.o1;
import androidx.lifecycle.u1;
import com.github.rudroid.fragments.g0;
import com.github.rudroid.templates.l;
import k71.xShadow;
import sy.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class IssueTemplatesBottomSheet extends Hilt_IssueTemplatesBottomSheet {
    public static final a Companion = new a();
    public l1 S0;

    public static final class a {
        public static IssueTemplatesBottomSheet a(String str, String str2, String str3) {
            k71.k.g(str, "repositoryName");
            k71.k.g(str2, "repositoryOwner");
            IssueTemplatesBottomSheet issueTemplatesBottomSheet = new IssueTemplatesBottomSheet();
            l.a aVar = l.Companion;
            Bundle bundle = new Bundle();
            aVar.getClass();
            bundle.putString("EXTRA_REPO_OWNER", str2);
            bundle.putString("EXTRA_REPO_NAME", str);
            bundle.putString("EXTRA_PARENT_ISSUE_ID", str3);
            issueTemplatesBottomSheet.n4(bundle);
            return issueTemplatesBottomSheet;
        }
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return IssueTemplatesBottomSheet.this;
        }
    }

    public static final class c extends k71.l implements j71.a {
        public final /* synthetic */ b s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.s = bVar;
        }

        public final Object a() {
            return (u1) this.s.a();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((u1) this.s.getValue()).K0();
        }
    }

    public static final class e extends k71.l implements j71.a {
        public final /* synthetic */ Object s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
            super(0);
            this.s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.r rVar = (u1) this.s.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return rVar2 != null ? rVar2.g0() : t6.a.b;
        }
    }

    public static final class f extends k71.l implements j71.a {
        public final /* synthetic */ Object t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w61.h hVar) {
            super(0);
            this.t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            o1 f0;
            androidx.lifecycle.r rVar = (u1) this.t.getValue();
            androidx.lifecycle.r rVar2 = rVar instanceof androidx.lifecycle.r ? rVar : null;
            return (rVar2 == null || (f0 = rVar2.f0()) == null) ? IssueTemplatesBottomSheet.this.f0() : f0;
        }
    }

    public IssueTemplatesBottomSheet() {
        w61.h s = w.s(w61.i.s, new c(new b()));
        this.S0 = new l1(xShadow.a(l.class), new d(s), new f(s), new e(s));
    }

    public final g0 D4() {
        g0.Companion.getClass();
        return g0.v;
    }

    public final r1.d E4() {
        return new r1.d(new h(this, 0), true, 1798097189);
    }

    public final l I4() {
        return (l) this.S0.getValue();
    }


    public static Object A3(Object... a) {
        return null;
    }

    public static Object s4(Object... a) {
        return null;
    }

    public static Object n4(Object... a) {
        return null;
    }

    public static Object f0(Object... a) {
        return null;
    }
}
