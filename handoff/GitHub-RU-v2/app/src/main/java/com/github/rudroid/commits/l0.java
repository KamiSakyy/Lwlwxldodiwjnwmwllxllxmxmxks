package com.github.rudroid.commits;

import com.github.service.models.response.type.StatusState;
import kotlin.NoWhenBranchMatchedException;
import yz0.j4;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l0 {
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public long f9202a;

    public static final class a extends l0 {

        /* renamed from: b, reason: collision with root package name */
        public j4 f9203b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9204c;

        /* renamed from: d, reason: collision with root package name */
        public int f9205d;

        /* renamed from: e, reason: collision with root package name */
        public int f9206e;

        /* renamed from: com.github.rudroid.commits.l0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0019a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9207a;

            static {
                int[] iArr = new int[StatusState.values().length];
                try {
                    iArr[StatusState.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StatusState.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StatusState.FAILURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StatusState.PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StatusState.EXPECTED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StatusState.UNKNOWN__.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f9207a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j4 j4Var) {
            super(j4Var.a.hashCode());
            k71.k.g(j4Var, "commit");
            this.f9203b = j4Var;
            StatusState statusState = j4Var.e;
            switch (C0019a.f9207a[statusState.ordinal()]) {
                case 1:
                    this.f9204c = true;
                    this.f9205d = pe.e.b(statusState);
                    this.f9206e = pe.e.a(statusState);
                    return;
                case 2:
                case 3:
                    this.f9204c = true;
                    this.f9205d = pe.e.b(statusState);
                    this.f9206e = pe.e.a(statusState);
                    return;
                case 4:
                case 5:
                    this.f9204c = true;
                    this.f9205d = pe.e.b(statusState);
                    this.f9206e = pe.e.a(statusState);
                    return;
                case 6:
                    this.f9204c = false;
                    this.f9205d = pe.e.b(statusState);
                    this.f9206e = pe.e.a(statusState);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && k71.k.b(this.f9203b, ((a) obj).f9203b);
        }

        public final int hashCode() {
            return this.f9203b.hashCode();
        }

        public final String toString() {
            return "CommitItem(commit=" + this.f9203b + ")";
        }
    }

    public static final class b {
    }

    public l0(long j10) {
        this.f9202a = j10;
    }
}
