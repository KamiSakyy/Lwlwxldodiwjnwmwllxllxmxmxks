package com.github.rudroid.issueorpullrequest.timeline;

/* loaded from: /home/user/work/p/classes.dex */
abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f16151a;

    /* renamed from: b, reason: collision with root package name */
    public int f16152b;

    public static final class a extends p0 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f16153c = new a(2131231103, 2131952943);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -27035469;
        }

        public final String toString() {
            return "CIFailure";
        }
    }

    public static final class b extends p0 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f16154c = new b(2131231287, 2131952942);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1579537449;
        }

        public final String toString() {
            return "Manual";
        }
    }

    public static final class c extends p0 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f16155c = new c(2131231285, 2131952946);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1473190407;
        }

        public final String toString() {
            return "Merge";
        }
    }

    public static final class d extends p0 {

        /* renamed from: c, reason: collision with root package name */
        public static final d f16156c = new d(2131231103, 2131952945);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -79973639;
        }

        public final String toString() {
            return "MergeConflict";
        }
    }

    public static final class e extends p0 {

        /* renamed from: c, reason: collision with root package name */
        public static final e f16157c = new e(2131231103, 2131952944);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2120675500;
        }

        public final String toString() {
            return "QueueCleared";
        }
    }

    public static final class f extends p0 {

        /* renamed from: c, reason: collision with root package name */
        public static final f f16158c = new f(2131231103, 2131952947);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 2080700117;
        }

        public final String toString() {
            return "RollBack";
        }
    }

    public p0(int i, int i10) {
        this.f16151a = i;
        this.f16152b = i10;
    }
}
