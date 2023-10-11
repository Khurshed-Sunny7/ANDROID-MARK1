package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val spinner = view.findViewById<Spinner>(R.id.spinner)

        // Получите массив вариантов из ресурсов
        val options = resources.getStringArray(R.array.spinner_options)

        // Создайте адаптер для Spinner
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, options)

        // Установите адаптер для Spinner
        spinner.adapter = adapter

        // Обработайте выбор элемента
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Обработайте выбор элемента
                val selectedItem = options[position]
                // Вы можете выполнить какие-либо действия с выбранным элементом
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Код, который выполняется, если ничего не выбрано
            }
        }

        return view
    }
}
