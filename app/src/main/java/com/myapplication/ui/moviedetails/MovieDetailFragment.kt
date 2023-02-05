package com.myapplication.ui.moviedetails

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.myapplication.R
import com.myapplication.databinding.FragmentMovieDetailBinding


class MovieDetailFragment : Fragment(R.layout.fragment_movie_detail) {

    private lateinit var binding: FragmentMovieDetailBinding
    private val args by navArgs<MovieDetailFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMovieDetailBinding.bind(view)
        Glide.with(requireContext()).load("https://image.tmdb.org/t/p/w500/${args.posterImageUrl}")
            .centerCrop().into(binding.imgMovie)
        Glide.with(requireContext())
            .load("https://image.tmdb.org/t/p/w500/${args.backgroundImageUrl}").centerCrop()
            .into(binding.imgBack)
        binding.txtDescrip.text = args.overview
        binding.txtLanguage.text = "Language ${args.language}"
        binding.txtReleased.text = "Released ${args.releaseDate}"
        binding.txtTitle.text = args.title
        binding.txtRating.text = "${args.voteAverege} (${args.voteCount} Reviews)"
    }
}