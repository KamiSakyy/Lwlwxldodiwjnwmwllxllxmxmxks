package com.github.rudroid.repository.files;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class z {

    public static final class a extends z {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19699a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 62713821;
        }

        public final String toString() {
            return "FileDoesNotExist";
        }
    }

    public static final class b extends z {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19700a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1846514364;
        }

        public final String toString() {
            return "FileExists";
        }
    }

    public static final class c extends z {

        /* renamed from: a, reason: collision with root package name */
        public static final c f19701a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 745808997;
        }

        public final String toString() {
            return "IllegalRecursivePath";
        }
    }

    public static final class d extends z {

        /* renamed from: a, reason: collision with root package name */
        public static final d f19702a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1680112640;
        }

        public final String toString() {
            return "Initial";
        }
    }
}
