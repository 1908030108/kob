<template>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
      <router-link class="navbar-brand" :to="{name: 'home'}">King Of Bots</router-link>
      <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <router-link :class="route_name == 'pk_index' ? 'nav-link active' : 'nav-link'" :to="{name: 'pk_index'}">对战</router-link>
          </li>
          <li class="nav-item">
          <!-- <a class="nav-link" href="/record/">对局列表</a> 不要浏览器刷新 -->
            <router-link :class="router_name == 'recorde_index' ? 'nav-link avtive' : 'nav-link'" :to="{name: 'record_index'}">对局列表</router-link>
          </li>
          <li class="nav-item">
            <router-link :class="router_name == 'ranklist_index' ? 'nav-link avtive' : 'nav-link'" :to="{name: 'ranklist_index'}">排行榜</router-link>
          </li>
        </ul>
        <ul class="navbar-nav">
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              tangshunzhi
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
              <li>
                <router-link class="dropdown-item" :to="{name: 'user_bot_index'}">我的bot</router-link>
              </li>
              <li><hr></li>
              <li>
                <router-link class="dropdown-item" :to="{name: '404'}">退出</router-link>
              </li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</template>

<script>
import { useRoute } from 'vue-router'
import { computed } from 'vue'
export default {
  setup () {
     const route = useRoute();
     let route_name = computed(() => route.name)
    return {
       route_name
    }
  },
  name: "NavBar"
}
</script>

<style scoped>

</style>