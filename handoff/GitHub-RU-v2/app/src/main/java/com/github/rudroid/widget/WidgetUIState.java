package com.github.rudroid.widget;

import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public abstract class WidgetUIState {
    public static final Companion Companion = new Companion();
    public static final Object a = w.s(w61.i.r, new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(26));

    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) WidgetUIState.a.getValue();
        }
    }

    @g81.e
    public static final class Loaded extends WidgetUIState {
        public static final Loaded INSTANCE = new Loaded();
        public static final /* synthetic */ Object b = w.s(w61.i.r, new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(27));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loaded);
        }

        public final int hashCode() {
            return 462137511;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Loaded";
        }
    }

    @g81.e
    public static final class Loading extends WidgetUIState {
        public static final Loading INSTANCE = new Loading();
        public static final /* synthetic */ Object b = w.s(w61.i.r, new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(28));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1441365210;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Loading";
        }
    }

    @g81.e
    public static final class Retrying extends WidgetUIState {
        public static final Retrying INSTANCE = new Retrying();
        public static final /* synthetic */ Object b = w.s(w61.i.r, new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(29));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retrying);
        }

        public final int hashCode() {
            return -423138212;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Retrying";
        }
    }

    @g81.e
    public static final class SignedOut extends WidgetUIState {
        public static final SignedOut INSTANCE = new SignedOut();
        public static final /* synthetic */ Object b = w.s(w61.i.r, new p(0));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SignedOut);
        }

        public final int hashCode() {
            return 1850625712;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "SignedOut";
        }
    }

    @g81.e
    public static final class Waiting extends WidgetUIState {
        public static final Waiting INSTANCE = new Waiting();
        public static final /* synthetic */ Object b = w.s(w61.i.r, new p(1));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Waiting);
        }

        public final int hashCode() {
            return -2073939477;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }

        public final String toString() {
            return "Waiting";
        }
    }

    @g81.e
    public static final class Error extends WidgetUIState {
        public static final Companion Companion = new Companion();
        public final String b;

        public static final class Companion {
            public final KSerializer serializer() {
                return WidgetUIState$Error$$serializer.INSTANCE;
            }
        }

        public Error(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && k71.k.b(this.b, ((Error) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return f1.e.z("Error(message=", this.b, ")");
        }

        public /* synthetic */ Error(String str, int i) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                c1.l(i, 1, WidgetUIState$Error$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }
    }
}
