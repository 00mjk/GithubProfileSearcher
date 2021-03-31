package githubprofilesearcher.caiodev.com.br.githubprofilesearcher.sections.utils.extensions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Suppress("UNUSED")
inline fun <reified T> ViewModel.castValue(attribute: Any?) =
    attribute as T

fun ViewModel.runTaskOnBackground(task: suspend () -> Unit) {
    viewModelScope.launch {
        task()
    }
}

@Suppress("UNUSED")
fun ViewModel.runDataStoreTask(task: suspend () -> Unit) {
    runBlocking {
        task()
    }
}
