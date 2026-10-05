package w2;

import java.text.BreakIterator;

/* loaded from: /home/user/work/p/classes.dex */
public final class b extends k.w {

    /* renamed from: e, reason: collision with root package name */
    public static b f32975e;

    /* renamed from: f, reason: collision with root package name */
    public static b f32976f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32977c;

    /* renamed from: d, reason: collision with root package name */
    public BreakIterator f32978d;

    @Override // k.w
    public final int[] m(int i) {
        switch (this.f32977c) {
            case k5.f.J:
                int length = q().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.f32978d;
                    if (breakIterator == null) {
                        k71.k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.f32978d;
                        if (breakIterator2 == null) {
                            k71.k.m("impl");
                            throw null;
                        }
                        int following = breakIterator2.following(i);
                        if (following == -1) {
                            return null;
                        }
                        return p(i, following);
                    }
                    BreakIterator breakIterator3 = this.f32978d;
                    if (breakIterator3 == null) {
                        k71.k.m("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                } while (i != -1);
                return null;
            default:
                if (q().length() <= 0 || i >= q().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!w(i) && (!w(i) || (i != 0 && w(i - 1)))) {
                    BreakIterator breakIterator4 = this.f32978d;
                    if (breakIterator4 == null) {
                        k71.k.m("impl");
                        throw null;
                    }
                    i = breakIterator4.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f32978d;
                if (breakIterator5 == null) {
                    k71.k.m("impl");
                    throw null;
                }
                int following2 = breakIterator5.following(i);
                if (following2 == -1 || !v(following2)) {
                    return null;
                }
                return p(i, following2);
        }
    }

    @Override // k.w
    public final int[] s(int i) {
        switch (this.f32977c) {
            case k5.f.J:
                int length = q().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.f32978d;
                    if (breakIterator == null) {
                        k71.k.m("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i)) {
                        BreakIterator breakIterator2 = this.f32978d;
                        if (breakIterator2 == null) {
                            k71.k.m("impl");
                            throw null;
                        }
                        int preceding = breakIterator2.preceding(i);
                        if (preceding == -1) {
                            return null;
                        }
                        return p(preceding, i);
                    }
                    BreakIterator breakIterator3 = this.f32978d;
                    if (breakIterator3 == null) {
                        k71.k.m("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = q().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !w(i - 1) && !v(i)) {
                    BreakIterator breakIterator4 = this.f32978d;
                    if (breakIterator4 == null) {
                        k71.k.m("impl");
                        throw null;
                    }
                    i = breakIterator4.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f32978d;
                if (breakIterator5 == null) {
                    k71.k.m("impl");
                    throw null;
                }
                int preceding2 = breakIterator5.preceding(i);
                if (preceding2 == -1 || !w(preceding2)) {
                    return null;
                }
                if (preceding2 == 0 || !w(preceding2 - 1)) {
                    return p(preceding2, i);
                }
                return null;
        }
    }

    public final void u(String str) {
        switch (this.f32977c) {
            case k5.f.J:
                this.f27535a = str;
                BreakIterator breakIterator = this.f32978d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    k71.k.m("impl");
                    throw null;
                }
            default:
                this.f27535a = str;
                BreakIterator breakIterator2 = this.f32978d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    k71.k.m("impl");
                    throw null;
                }
        }
    }

    public boolean v(int i) {
        if (i <= 0 || !w(i - 1)) {
            return false;
        }
        return i == q().length() || !w(i);
    }

    public boolean w(int i) {
        if (i < 0 || i >= q().length()) {
            return false;
        }
        return Character.isLetterOrDigit(q().codePointAt(i));
    }
}
