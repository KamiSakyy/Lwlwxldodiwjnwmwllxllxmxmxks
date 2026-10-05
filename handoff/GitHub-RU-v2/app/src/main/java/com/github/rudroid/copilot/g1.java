package com.github.rudroid.copilot;

import android.app.Application;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: /home/user/work/p/classes.dex */
public final class g1 {
    public static final ArrayList a(Application application) {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        while (arrayList.size() < 4) {
            String[] stringArray = application.getResources().getStringArray(2130903052);
            k71.k.f(stringArray, "getStringArray(...)");
            List g02 = x61.l.g0(stringArray);
            o71.a aVar = o71.d.f30094r;
            if (g02.isEmpty()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            String str2 = (String) g02.get(o71.d.f30094r.b(g02.size()));
            k71.k.d(str2);
            if (str2.equals(application.getString(2131952296))) {
                String[] stringArray2 = application.getResources().getStringArray(2130903053);
                k71.k.f(stringArray2, "getStringArray(...)");
                Object X = x61.l.X(stringArray2);
                k71.k.f(X, "random(...)");
                str = (String) X;
            } else if (str2.equals(application.getString(2131952301))) {
                String[] stringArray3 = application.getResources().getStringArray(2130903058);
                k71.k.f(stringArray3, "getStringArray(...)");
                Object X2 = x61.l.X(stringArray3);
                k71.k.f(X2, "random(...)");
                str = (String) X2;
            } else if (str2.equals(application.getString(2131952291))) {
                String[] stringArray4 = application.getResources().getStringArray(2130903047);
                k71.k.f(stringArray4, "getStringArray(...)");
                Object X3 = x61.l.X(stringArray4);
                k71.k.f(X3, "random(...)");
                str = (String) X3;
            } else if (str2.equals(application.getString(2131952299))) {
                String[] stringArray5 = application.getResources().getStringArray(2130903056);
                k71.k.f(stringArray5, "getStringArray(...)");
                Object X4 = x61.l.X(stringArray5);
                k71.k.f(X4, "random(...)");
                str = (String) X4;
            } else if (str2.equals(application.getString(2131952302))) {
                String[] stringArray6 = application.getResources().getStringArray(2130903059);
                k71.k.f(stringArray6, "getStringArray(...)");
                Object X5 = x61.l.X(stringArray6);
                k71.k.f(X5, "random(...)");
                str = (String) X5;
            } else if (str2.equals(application.getString(2131952294))) {
                String[] stringArray7 = application.getResources().getStringArray(2130903050);
                k71.k.f(stringArray7, "getStringArray(...)");
                Object X6 = x61.l.X(stringArray7);
                k71.k.f(X6, "random(...)");
                str = (String) X6;
            } else if (str2.equals(application.getString(2131952292))) {
                String[] stringArray8 = application.getResources().getStringArray(2130903048);
                k71.k.f(stringArray8, "getStringArray(...)");
                Object X7 = x61.l.X(stringArray8);
                k71.k.f(X7, "random(...)");
                str = (String) X7;
            } else if (str2.equals(application.getString(2131952300))) {
                String[] stringArray9 = application.getResources().getStringArray(2130903057);
                k71.k.f(stringArray9, "getStringArray(...)");
                Object X8 = x61.l.X(stringArray9);
                k71.k.f(X8, "random(...)");
                str = (String) X8;
            } else if (str2.equals(application.getString(2131952297))) {
                String[] stringArray10 = application.getResources().getStringArray(2130903054);
                k71.k.f(stringArray10, "getStringArray(...)");
                Object X9 = x61.l.X(stringArray10);
                k71.k.f(X9, "random(...)");
                str = (String) X9;
            } else if (str2.equals(application.getString(2131952293))) {
                String[] stringArray11 = application.getResources().getStringArray(2130903049);
                k71.k.f(stringArray11, "getStringArray(...)");
                Object X10 = x61.l.X(stringArray11);
                k71.k.f(X10, "random(...)");
                str = (String) X10;
            } else if (str2.equals(application.getString(2131952295))) {
                String[] stringArray12 = application.getResources().getStringArray(2130903051);
                k71.k.f(stringArray12, "getStringArray(...)");
                Object X11 = x61.l.X(stringArray12);
                k71.k.f(X11, "random(...)");
                str = (String) X11;
            } else if (str2.equals(application.getString(2131952298))) {
                String[] stringArray13 = application.getResources().getStringArray(2130903055);
                k71.k.f(stringArray13, "getStringArray(...)");
                Object X12 = x61.l.X(stringArray13);
                k71.k.f(X12, "random(...)");
                str = (String) X12;
            } else {
                str = "";
            }
            com.github.rudroid.uitoolkit.copilot.c cVar = new com.github.rudroid.uitoolkit.copilot.c(str2, str);
            if (linkedHashSet.add(str2)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
