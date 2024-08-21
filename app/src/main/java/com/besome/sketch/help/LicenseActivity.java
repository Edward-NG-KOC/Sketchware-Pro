package com.besome.sketch.help;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;

import com.sketchware.remod.R;
import com.sketchware.remod.databinding.ActivityOssLibrariesBinding;
import com.besome.sketch.lib.base.BaseAppCompatActivity;

import a.a.a.oB;
import mod.hey.studios.util.Helper;

public class LicenseActivity extends BaseAppCompatActivity {

    private ActivityOssLibrariesBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         binding = ActivityOssLibrariesBinding.inflate(getLayoutInflater());
         setContentView(binding.getRoot());
         
         binding.toolbar.setNavigationOnClickListener(Helper.getBackPressedClickListener(this));

         binding.licensesText.setText(new oB().b(getApplicationContext(), "oss.txt"));
         binding.licensesText.setAutoLinkMask(Linkify.WEB_URLS);
         binding.licensesText.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
