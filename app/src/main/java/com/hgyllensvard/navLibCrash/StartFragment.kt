package com.hgyllensvard.navLibCrash

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class StartFragment : Fragment() {
    
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onStart() {
        super.onStart()

        findNavController().navigate(StartFragmentDirections.toA())
        findNavController().navigate(StartFragmentDirections.toB())

//        If only going to A, it works fine
//        findNavController().navigate(StartFragmentDirections.toA())

//        If only going to B, it works fine
//        findNavController().navigate(StartFragmentDirections.toA())
    }
}

