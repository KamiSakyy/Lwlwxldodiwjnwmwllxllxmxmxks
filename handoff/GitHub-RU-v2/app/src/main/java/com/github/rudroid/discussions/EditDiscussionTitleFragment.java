package com.github.rudroid.discussions;

/* loaded from: /home/user/work/p/classes.dex */
public final class EditDiscussionTitleFragment extends Hilt_EditDiscussionTitleFragment {
    public final androidx.lifecycle.l1 I0;

    public static final class a extends k71.l implements j71.a {
        public a() {
            super(0);
        }

        public final Object a() {
            return EditDiscussionTitleFragment.this;
        }
    }

    public static final class b extends k71.l implements j71.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f11093s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f11093s = aVar;
        }

        public final Object a() {
            return (androidx.lifecycle.u1) this.f11093s.a();
        }
    }

    public static final class c extends k71.l implements j71.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f11094s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w61.h hVar) {
            super(0);
            this.f11094s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            return ((androidx.lifecycle.u1) this.f11094s.getValue()).K0();
        }
    }

    public static final class d extends k71.l implements j71.a {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f11095s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w61.h hVar) {
            super(0);
            this.f11095s = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.u1 u1Var = (androidx.lifecycle.u1) this.f11095s.getValue();
            androidx.lifecycle.r rVar = u1Var instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) u1Var : null;
            return rVar != null ? rVar.g0() : t6.a.f32099b;
        }
    }

    public static final class e extends k71.l implements j71.a {

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f11097t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w61.h hVar) {
            super(0);
            this.f11097t = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final Object a() {
            androidx.lifecycle.o1 f02;
            androidx.lifecycle.u1 u1Var = (androidx.lifecycle.u1) this.f11097t.getValue();
            androidx.lifecycle.r rVar = u1Var instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) u1Var : null;
            return (rVar == null || (f02 = rVar.f0()) == null) ? EditDiscussionTitleFragment.this.f0() : f02;
        }
    }

    public EditDiscussionTitleFragment() {
        w61.h s2 = sy.w.s(w61.i.s, new b(new a()));
        this.I0 = new androidx.lifecycle.l1(k71.x.a(l8.class), new c(s2), new e(s2), new d(s2));
    }

    @Override // com.github.rudroid.activities.BaseEditTitleFragment
    public final com.github.rudroid.viewmodels.u0 H4() {
        return (l8) this.I0.getValue();
    }

    public <T0> T0 f0(Object... a) {
        return null;
    }
}
