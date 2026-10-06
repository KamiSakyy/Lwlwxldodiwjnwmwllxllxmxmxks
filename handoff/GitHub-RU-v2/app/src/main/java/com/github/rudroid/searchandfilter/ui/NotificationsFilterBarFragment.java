package com.github.rudroid.searchandfilter.ui;

import androidx.lifecycle.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class NotificationsFilterBarFragment extends Hilt_NotificationsFilterBarFragment {
    public static final a Companion = new a();
    public final l1 O0 = new l1(k71.x.a(com.github.rudroid.searchandfilter.h0.class), new b(), new d(), new c());

    public static final class a {
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return NotificationsFilterBarFragment.this.g4().K0();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return NotificationsFilterBarFragment.this.g4().g0();
        }
    }

    public static final class d extends k71.l implements j71.a {
        public d() {
            super(0);
        }

        public final Object a() {
            return NotificationsFilterBarFragment.this.g4().f0();
        }
    }

    @Override // com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase
    public final com.github.rudroid.searchandfilter.q H4() {
        return (com.github.rudroid.searchandfilter.h0) this.O0.getValue();
    }


    public <T0> T0 g4(Object... a) {
        return null;
    }
}
