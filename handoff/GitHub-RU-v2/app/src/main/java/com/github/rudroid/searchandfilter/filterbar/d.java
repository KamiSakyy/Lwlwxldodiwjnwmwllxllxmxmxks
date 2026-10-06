package com.github.rudroid.searchandfilter.filterbar;

import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {

    public static final class a extends d {
        public int a;

        public a(int i) {
            this.a = i;
        }
    }

    public static final class b extends d {
        public a a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            public static final a A;
            public static final a B;
            public static final /* synthetic */ a[] C;
            public static final a r;
            public static final a s;
            public static final a t;
            public static final a u;
            public static final a v;
            public static final a w;
            public static final a x;
            public static final a y;
            public static final a z;

            static {
                a aVar = new a("User", 0);
                r = aVar;
                a aVar2 = new a("AddUser", 1);
                s = aVar2;
                a aVar3 = new a("Repository", 2);
                t = aVar3;
                a aVar4 = new a("Organization", 3);
                u = aVar4;
                a aVar5 = new a("Milestone", 4);
                v = aVar5;
                a aVar6 = new a("Project", 5);
                w = aVar6;
                a aVar7 = new a("Label", 6);
                x = aVar7;
                a aVar8 = new a("Category", 7);
                y = aVar8;
                a aVar9 = new a("Issue", 8);
                z = aVar9;
                a aVar10 = new a("None", 9);
                A = aVar10;
                a aVar11 = new a("Pencil", 10);
                B = aVar11;
                a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11};
                C = aVarArr;
                l0.t(aVarArr);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) C.clone();
            }
        }

        public b(a aVar) {
            k71.k.g(aVar, "icon");
            this.a = aVar;
        }
    }
    public Object s(Object p1, Object p2) { return null; }
}
