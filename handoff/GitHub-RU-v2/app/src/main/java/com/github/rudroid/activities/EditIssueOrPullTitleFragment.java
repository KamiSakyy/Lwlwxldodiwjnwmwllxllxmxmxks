package com.github.rudroid.activities;

/* loaded from: /home/user/work/p/classes.dex */
public final class EditIssueOrPullTitleFragment extends Hilt_EditIssueOrPullTitleFragment {
    public final androidx.lifecycle.l1 I0;

    public static final class a extends k71.l implements j71.a {
        public a() {
            super(0);
        }

        public final Object a() {
            return EditIssueOrPullTitleFragment.this;
        }
    }

    public static final class b extends k71.l implements j71.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f5756s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f5756s = aVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.f5756s.a();
        }
    }

    public static final class c extends k71.l implements j71.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f5757s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w61.h hVar) {
            super(0);
            this.f5757s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((androidx.lifecycle.u1) this.f5757s.getValue()).K0();
        }
    }

    public static final class d extends k71.l implements j71.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f5758s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w61.h hVar) {
            super(0);
            this.f5758s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.u1 u1Var = (androidx.lifecycle.u1) this.f5758s.getValue();
            androidx.lifecycle.r rVar = u1Var instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) u1Var : null;
            return rVar != null ? rVar.g0() : t6.a.f32099b;
        }
    }

    public static final class e extends k71.l implements j71.a {

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f5760t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
            super(0);
            this.f5760t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f02;
            androidx.lifecycle.u1 u1Var = (androidx.lifecycle.u1) this.f5760t.getValue();
            androidx.lifecycle.r rVar = u1Var instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) u1Var : null;
            return (rVar == null || (f02 = rVar.f0()) == null) ? EditIssueOrPullTitleFragment.this.f0() : f02;
        }
    }

    public EditIssueOrPullTitleFragment() {
        w61.h s2 = sy.w.s(w61.i.s, new b(new a()));
        this.I0 = new androidx.lifecycle.l1(k71.x.a(com.github.rudroid.viewmodels.e0.class), new c(s2), new e(s2), new d(s2));
    }

    @Override // com.github.rudroid.activities.BaseEditTitleFragment
    public final com.github.rudroid.viewmodels.u0 H4() {
        return (com.github.rudroid.viewmodels.e0) this.I0.getValue();
    }

    public <T0> T0 f0(Object... a) {
        return null;
    }
}
