package com.github.rudroid.searchandfilter.complexfilter.project;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.j1;
import androidx.lifecycle.t1;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;
import ic.t0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class LegacyProjectsTabFragment extends Hilt_LegacyProjectsTabFragment<t0> {
    public static final a Companion = new a();
    public final int E0 = 2131558455;
    public final List F0 = sy.d0.o(c.b.b, c.a.b);

    public static final class a {
    }

    public final class b extends j1 {
        public b() {
            super(LegacyProjectsTabFragment.this.A3());
        }

        public final int c() {
            return 2;
        }

        public final CharSequence d(int i) {
            LegacyProjectsTabFragment legacyProjectsTabFragment = LegacyProjectsTabFragment.this;
            String C3 = legacyProjectsTabFragment.C3(((c) legacyProjectsTabFragment.F0.get(i)).a);
            k71.k.f(C3, "getString(...)");
            return C3;
        }

        public final SearchAndFilterBaseFragment k(int i) {
            LegacyProjectsTabFragment legacyProjectsTabFragment = LegacyProjectsTabFragment.this;
            c cVar = (c) legacyProjectsTabFragment.F0.get(i);
            if (k71.k.b(cVar, c.b.b)) {
                SelectableRepositoryProjectsFragment.Companion.getClass();
                SelectableRepositoryProjectsFragment selectableRepositoryProjectsFragment = new SelectableRepositoryProjectsFragment();
                selectableRepositoryProjectsFragment.n4(((androidx.fragment.app.a0) legacyProjectsTabFragment).x);
                return selectableRepositoryProjectsFragment;
            }
            if (!k71.k.b(cVar, c.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            SelectableOwnerLegacyProjectsFragment.Companion.getClass();
            SelectableOwnerLegacyProjectsFragment selectableOwnerLegacyProjectsFragment = new SelectableOwnerLegacyProjectsFragment();
            selectableOwnerLegacyProjectsFragment.n4(((androidx.fragment.app.a0) legacyProjectsTabFragment).x);
            return selectableOwnerLegacyProjectsFragment;
        }
    }

    public static abstract class c {
        public final int a;

        public static final class a extends c {
            public static final a b = new a(2131954231);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -549325383;
            }

            public final String toString() {
                return "Organization";
            }
        }

        public static final class b extends c {
            public static final b b = new b(2131954232);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1411887792;
            }

            public final String toString() {
                return "Repository";
            }
        }

        public c(int i) {
            this.a = i;
        }
    }

    public final int C4() {
        return this.E0;
    }

    public final t1 K0() {
        return j4().K0();
    }

    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        B4().P.setAdapter(new b());
        B4().P.setOffscreenPageLimit(2);
        B4().O.setupWithViewPager(B4().P);
    }


    public <T0> T0 A3(Object... a) {
        return null;
    }

    public <T0> T0 C3(Object... a) {
        return null;
    }

    public <T0> T0 j4(Object... a) {
        return null;
    }

    public <T0> T0 B4(Object... a) {
        return null;
    }
}
