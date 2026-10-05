package com.github.rudroid.searchandfilter.complexfilter;

import androidx.lifecycle.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {

    public static final class a implements q0, k71.g {
        public final /* synthetic */ y r;

        public a(y yVar) {
            this.r = yVar;
        }

        public final /* synthetic */ void a(Object obj) {
            this.r.k(obj);
        }

        public final w61.e b() {
            return this.r;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof q0) || !(obj instanceof k71.g)) {
                return false;
            }
            return this.r.equals(((k71.g) obj).b());
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }
}
